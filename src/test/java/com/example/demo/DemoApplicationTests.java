package com.example.demo;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		List<String> data = new ArrayList<>();
		List<String> map = new ArrayList<>();

		data.add("AAA");
		data.add("CCC");
		data.add("DDD");

		map.add("BBB");
		map.add("AAA");
		map.add("CCC");
		
		Collection<String> ret = CollectionUtils.removeAll(map, data);
		ret.addAll(CollectionUtils.removeAll(data, map));

		Collection<String> listToAdd = CollectionUtils.removeAll(data, map);
		Collection<String> listToRemove = CollectionUtils.removeAll(map, data);




		System.out.println("adicionar é:");
		listToAdd.forEach(val-> System.out.println(val));

		System.out.println("remover é:");
		listToRemove.forEach(val-> System.out.println(val));


	}

}
