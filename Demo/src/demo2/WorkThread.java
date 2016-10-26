package demo2;

import java.util.List;

/**
 * ����һ��ʵ��Runnable�ӿڵĹ����߳�����ʵ������Task,һ�������߳̿���ʵ�ֶ������
 * @author Administrator
 *
 */
public class WorkThread implements Runnable{
	
	// ���̴߳�ִ�е������б���Ҳ����ָΪ������������ʼֵ
	private List<Task> taskList = null;
	private int threadId;

	/**
	 * ���칤���̣߳�Ϊ��ָ�������б��������߳� ID 
	 * @param taskList
	 * @param threadId
	 */
	public WorkThread(List<Task> taskList,int threadId){
		this.taskList = taskList;
		this.threadId = threadId;

	}
	
	/**
	 * ִ�б�ָ�ɵ���������
	 */
	@Override
	public void run() {
		for(Task task : taskList){
			//����Task������ִ�з���
			task.execute();
		}
		
	}

}
