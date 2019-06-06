package com.challa.codeahead1.util;

import java.util.*;

public class MapWithVersion {
	List<LinkedList<KeyValue>> list = new ArrayList<LinkedList<KeyValue>>();
	Map<String, LinkedList<KeyValue>> map = new HashMap<String, LinkedList<KeyValue>>();
	int version = 0;
public static void main(String args[]){
	MapWithVersion version=new MapWithVersion();
	System.out.println(version.put("desk-a", "tomer"));
	System.out.println(version.put("desk-a", "nikhil"));
	System.out.println(version.put("desk-b", "tomer"));
	System.out.println(version.map);
	System.out.println(version.delete("desk-a"));
	System.out.println(version.map);
}
	
	int put(String key, String value) {
		version++;
		LinkedList<KeyValue> list = map.get(key);
		if (list == null) {
			list = new LinkedList<KeyValue>();
			list.add(new KeyValue(value, key, version));
			map.put(key, list);
		} else {
			list.addFirst(new KeyValue(value, key, version));
		}
		return version;
	}

	int delete(String key, int version) {
		version++;
		LinkedList<KeyValue> list = map.get(key);
		if (list != null) {
			if (list.size() == 1) {
				map.remove(key);
			} else {
				list.remove(new KeyValue(key, version));
			}
		}
		return version;
	}
	int delete(String key) {
		version++;
		LinkedList<KeyValue> list = map.get(key);
		if (list != null) {
			if (list.size() == 1) {
				map.remove(key);
			} else {
				list.removeFirst();
			}
		}
		return version;
	}
}

class KeyValue {
	String value;
	String Key;
	int version;
	public KeyValue(String value, String key, int version) {
		super();
		this.value = value;
		Key = key;
		this.version = version;
	}

	public KeyValue(String key, int version) {
		Key = key;
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Key == null) ? 0 : Key.hashCode());
		result = prime * result + version;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValue other = (KeyValue) obj;
		if (Key == null) {
			if (other.Key != null)
				return false;
		} else if (!Key.equals(other.Key))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
}
