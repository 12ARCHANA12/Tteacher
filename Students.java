package com.src;
class Students extends Teacher{
public void listen(){
System.out.println("listining to teacher");
}
public static void main(String[] args){
Students stu =new Students();
stu.teach();
stu.listen();
}
}




