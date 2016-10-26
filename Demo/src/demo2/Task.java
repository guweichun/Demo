package demo2;

/**
 * ����Task��
 * @author Administrator
 *
 */
public class Task {

	//��ʶ����״̬����
	public static final int READY = 0;
	public static final int RUNNING = 1;
	public static final int FINISHED = 2;
	
	private int status;  //����һ�����������ҵ����ı��������ڱ�ʶ����

	private int taskId;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	} 
	
	/**
	 * �����ʼ���Ĺ��췽��������һ������ID
	 * @param taskId
	 */
	public Task(int taskId){
		this.taskId=taskId;
		this.status=READY;
	}
	
	/**
	 * ����ִ�еķ���
	 */
	public void execute(){
		// ����״̬Ϊ������
		setStatus(RUNNING);
		System.out.println("��ǰ�߳���"+Thread.currentThread().getName()+"| ���� ID �ǣ�"+this.taskId);
		//����һ����ʱ
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//ִ�����״̬��Ϊ���
		setStatus(FINISHED);
	}
	
}
