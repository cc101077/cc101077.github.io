/** * Copyright (C), 2018-2019,  XXX有限公司 * FileName: test * Author:   xiaobai * Date:     2019/4/15  19:33 * Description: * History: * <author>          <time>           <version>          <desc> * 作者姓名           修改时间           版本号             描述 */package main.webapp.java;import java.lang.reflect.Field;/** *  <一句话功能简述> <br> *  <> * * @author xiaobai * @create 2019/4/15 * @since 1.0.0 */public class test {	private static int [] array = new int [3];	private static int length = array.length;	private static Class<One> one = One.class;	private static Class<Another> another = Another.class;	public static void main(String [] arge) throws Exception {//		One oneObject = one.newInstance();//		oneObject.call();////		Another anotherObject =  another.getDeclaredConstructor().newInstance();//		anotherObject.spealk();//////		Field privateFieldInOne = one.getDeclaredField("inner");//		privateFieldInOne.setAccessible(true);////		privateFieldInOne.set(oneObject,"world changed.");////		System.out.println(oneObject.getInner());//		ClassLoader c = TestWhoLoad.class.getClassLoader();//		ClassLoader c1 = c.getParent();//		ClassLoader c2 = c1.getParent();	}}class One{	private String inner = "time flies.";//	private Integer aa = 123;	public void call(){		System.out.println("hello world");	}	public String getInner() {		return inner;	}}class Another {	public void spealk(){		System.out.println("easy coding");	}}