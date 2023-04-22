public class Main {
    public static void main(String[] args) {
        ChainedHashTable<String, String> hashTable = new ChainedHashTable<>();
        hashTable.put("HN", "Honolulu");
        hashTable.put("HN", "Honduras");
        hashTable.put("MX", "Mexico");

        System.out.println(hashTable.size());
    }
}
