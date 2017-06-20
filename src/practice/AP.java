package practice;

public class AP {
	static int i=47;  //static成员变量：含有static时，i 指的是静态变量，只加载一次；而去掉static之后，每次调用都要重新加载，所以不会被覆盖掉
	
public void call(){
	for (i=0;i<3;i++){
		System.out.print(i+"");
		if(i==2){
			System.out.println("\n");
        }
                     }
}
public AP(){

}
public static void main(String[] args){
	AP t1=new AP();
	AP t2=new AP();
	t2.i=60; //t2改变了静态变量的值，此时使用t1调用时，值也是60
	System.out.println(t1.i);
	t1.call();
	
	System.out.println(t2.i);
	t2.call();
}
}