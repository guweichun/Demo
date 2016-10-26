package demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ַ���
 * @author Administrator
 *
 */
public class TaskManager {

	//����Ҫ������������߳�����
	public static int threadCount=5;
	
	/**
	 * �� List �е���������ÿ���̣߳���ƽ�����䣬ʣ�ڵ����θ��Ӹ�ǰ����߳� ���ص������ж��ٸ�Ԫ�� (List) �ͱ������������ٸ������߳�
	 * 
	 * @param taskList
	 * @param threadCount
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List[] managerTasks(List<Task> taskList,int threadCount){
		// ÿ���߳�����Ҫִ�е�������,���粻Ϊ�����ʾÿ���̶߳�����䵽����
		int minTaskCount = taskList.size() / threadCount;
		// ƽ�������ʣ�µ�����������Ϊ�����������������ӵ�ǰ����߳���
		int remainTaskCount = taskList.size() % threadCount;
		// ʵ��Ҫ�������߳���,��������̱߳����񻹶�
		// ��Ȼֻ��Ҫ������������ͬ�����Ĺ����̣߳�һ��һ��ִ��
		// �Ͼ�������ʵ�����̳߳أ������ò���Ԥ�ȳ�ʼ�������ߵ��߳�
		int actualThreadCount = minTaskCount > 0 ? threadCount : remainTaskCount;
		// Ҫ�������߳����飬�Լ�ÿ���߳�Ҫִ�е������б�
		List<Task>[] taskListPerThread = new List[actualThreadCount];
		int taskIndex = 0;
		// ƽ��������������ÿ���Ӹ�һ���̺߳��ʣ���������������� remainTaskCount
		// ��ͬ�ı�������Ȼ����ִ���иı� remainTaskCount ԭ��ֵ�������鷳
		int remainIndces = remainTaskCount;
		for (int i = 0; i < taskListPerThread.length; i++) {
			taskListPerThread[i] = new ArrayList<Task>();
			// ��������㣬�߳�Ҫ���䵽����������
			if (minTaskCount > 0) {
				for (int j = taskIndex; j < minTaskCount + taskIndex; j++) {
					taskListPerThread[i].add(taskList.get(j));
				}
				taskIndex += minTaskCount;
			}
			// ���绹��ʣ�µģ���һ��������߳���
			if (remainIndces > 0) {
				taskListPerThread[i].add(taskList.get(taskIndex++));
				remainIndces--;
			}
		}
		// ��ӡ����ķ������
		for (int i = 0; i < taskListPerThread.length; i++) {
			System.out.println("�߳� " + i + " ����������" + taskListPerThread[i].size() 
					+ " ����[" + taskListPerThread[i].get(0).getTaskId() + "," 
					+ taskListPerThread[i].get(taskListPerThread[i].size() - 1).getTaskId() + "]");
		}
		return taskListPerThread;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//��ʼ��Ҫִ�е������б�
		List<Task> taskList = new ArrayList();
		for(int i=0;i<50;i++){
			taskList.add(new Task(i));
		}
		
		//����Ҫ�����Ĺ����߳�����
		//int threadCount = 5;
		List[] taskListPerThread = managerTasks(taskList, TaskManager.threadCount);
		System.out.println("ʵ��Ҫ�����Ĺ����߳�����"+taskListPerThread.length);

		for (int i = 0; i < taskListPerThread.length; i++) { 
			//ʵ�ʿ���ʱ�Ƿ���Ҫ������ŷ������Ӷ���
			Thread workThread = new Thread(new WorkThread(taskListPerThread[i],i)); 
			workThread.start();
		}

	}
	
}
