package date;

public class TestStuDAO {
	public static void main(String[] args) {
		Stu stu=new Stu("����11",243243,"JAVA����ʦ","2018.3.20","�����",
				2343,"http://xxxxx.com","��ʤ��ʤ��","����ʦ��","֪������");
		StuDAO sd=new StuDAO();
		sd.add(stu);
		System.out.println(stu.id);
		
		stu.name="�µ�����";
		sd.update(stu);
		System.out.println(stu);
		sd.delete(3);
		System.out.println(sd.GetFromName("����11"));
		System.out.println(sd.list());
	}
}
