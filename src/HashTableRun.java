public class HashTableRun {
    public static void main(String[] args) {
        HashTableUsingArray<String> ht = new HashTableUsingArray<String>(10);
        ht.put(11, "Name1");
        ht.put(12, "Name2");
        ht.put(13, "Name3");
        ht.put(14, "Name4");
        System.out.println(ht.get(11));
    }
}
