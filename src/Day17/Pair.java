package Day17;

public class Pair<K,V> {
	private K Key;
	private V value;
	public Pair(K key, V value) {
		super();
		Key = key;
		this.value = value;
	}
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
