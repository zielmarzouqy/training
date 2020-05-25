package org.training.training.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
//		List<String> arrayList = new ArrayList<String>();
//		arrayList.add("z");
//		arrayList.add("b");
//		arrayList.add("c");
//		arrayList.add("y");
//		arrayList.add("a");
//		arrayList.add("d");
//		for(String s : arrayList) {
//			System.out.println(s);
//		}
//		System.out.println("--------------------------------------------------");
//		List<String> linkedList = new LinkedList<String>();
//		linkedList.add("z5");
//		linkedList.add("a1");
//		linkedList.add("a3");
//		linkedList.add(null);
//		linkedList.add("a1");
//		linkedList.add("z4");
//		linkedList.add(null);
//		linkedList.add(null);
//		for(String s : linkedList) {
//			System.out.println(s);
//		}
//		
		System.out.println("------------------hashSet--------------------------------");
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("z");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("y");
		hashSet.add("a");
		hashSet.add("d");
		hashSet.add(null);
		for(String s : hashSet) {
			System.out.println(s);
		}
		
		System.out.println("------------------linkedHashSet--------------------------------");
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("z");
		linkedHashSet.add("b");
		linkedHashSet.add("c");
		linkedHashSet.add("y");
		linkedHashSet.add("a");
		linkedHashSet.add("d");
		hashSet.add(null);
		for(String s : linkedHashSet) {
			System.out.println(s);
		}
		
		System.out.println("------------------treeSet--------------------------------");
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("z");
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("y");
		treeSet.add("a");
		treeSet.add("d");
		for(String s : treeSet) {
			System.out.println(s);
		}
		
//		ApplicationContext appcntxt = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//		ICommande commandeImpl = appcntxt.getBean("commandeImpl", ICommande.class);
//
//		Article article1 = new Article("code_ar1", "designation_ar1", 12);
//		Article article11 = new Article("code_ar1", "designation_ar1", 12);
//		Article article2 = new Article("code_ar2", "designation_ar2", 22);
//		Article article3 = new Article("code_ar3", "designation_ar3", 120);
//		
//		commandeImpl.ajouterArticle(article1, 2);
//		commandeImpl.ajouterArticle(article11, 3);
//		commandeImpl.ajouterArticle(article2, 4);
//		commandeImpl.ajouterArticle(article3, 8);
//		commandeImpl.showCommande();
//
//		 double montant = commandeImpl.calculeMontant();
//		 System.out.println(montant);

	}

}
