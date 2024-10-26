/**
 * ini merupakan class interface yang menampung method translate (menerjemahkan kata yang diinputkan) dan inputword (untuk meminta inputan dari user)
 */
public interface KamusSederhana {
    /**
     * menerjemahkan kosa kata yang diinputkan oleh user
     */
    void translate();

    /**
     * meminta inputan kosa kata dari user yang ingin ditranslate
     * @return kata yang akan ditranslate
     */
    String inputword();
}
