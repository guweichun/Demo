package demo2;

import java.util.List;

/**
 * 建立一个实现Runnable接口的工作线程类来实现任务Task,一个工作线程可以实现多个任务。
 * @author Administrator
 *
 */
public class WorkThread implements Runnable{
	
	// 本线程待执行的任务列表，你也可以指为任务索引的起始值
	private List<Task> taskList = null;
	private int threadId;

	/**
	 * 构造工作线程，为其指派任务列表，及命名线程 ID 
	 * @param taskList
	 * @param threadId
	 */
	public WorkThread(List<Task> taskList,int threadId){
		this.taskList = taskList;
		this.threadId = threadId;

	}
	
	/**
	 * 执行被指派的所有任务
	 */
	@Override
	public void run() {
		for(Task task : taskList){
			//调用Task的任务执行方法
			task.execute();
		}
		
	}

}
