package org.archarmon.seaspace.client;

import java.util.ArrayList;
/**
	Класс для описания свободного места, которое клиент предоставил для пользования друзьям.
*/

public class SharedSpace {
	/**
		Количество предоставленого места (в мегабайтах)
	*/
	private int sharedSize;

	/**
		Список друзей, которым доступно данное пространство
	*/
	private ArrayList<Integer> friends;

	/**
		Конструктор по умолчанию
	*/
	public SharedSpace {
		sharedSize = 0;
		friends = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getFriendsList () {
		retunn friends;
	}

	public void setSharedSize (int size) {
		sharedSize = size;
	}

	public int getSharedSize () {
		return sharedSize;
	}
}