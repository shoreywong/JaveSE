package day1503;
/*
 * ʵ����Comparable �ӿڵĶ���
 * ������ֱ�ӱȽϴ�С������
 */
public class Food implements Comparable<Food> {
	private String name;
	private int times;
	
	public Food() {
		super();
	}
	public Food(String name, int times) {
		super();
		this.name = name;
		this.times = times;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	@Override
	public String toString() {
		return name+";"+times;
	}
	/*
	 * ��ǰ�������������o�Ƚϴ�С
	 * ��ǰ���������
	 * ��ǰ����С������
	 * ��ͬ��0
	 */
	@Override
	public int compareTo(Food o) {
		return times - o.times;
	}
}





