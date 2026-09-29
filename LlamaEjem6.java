public class LlamaEjem6 {
    public static void main(String[] args) {
        Ejem6<String, String> ejem1 = new Ejem6<>("Hola", "Mundo");
        ejem1.verificatipo();

        Ejem6<Integer, Integer> ejem2 = new Ejem6<>(5, 10);
        ejem2.verificatipo();

        Ejem6<Double, Double> ejem3 = new Ejem6<>(3.14, 2.71);
        ejem3.verificatipo();

        Ejem6<Boolean, Boolean> ejem4 = new Ejem6<>(true, false);
        ejem4.verificatipo();

        Ejem6<Character, Character> ejem5 = new Ejem6<>('A', 'B');
        ejem5.verificatipo();

        Ejem6<Float, Float> ejem6 = new Ejem6<>(1.5f, 2.5f);
        ejem6.verificatipo();
    }
}
