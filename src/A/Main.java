package A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> song = new ArrayList<>();
        String string1 = "Ветер с моря дул";
        String string2 = "Нагонял беду";
        String string3 = "И сказал ты мне";
        String string4 = "Больше не приду";

        song.add(string1);
        song.add(string1);
        song.add(string2);
        song.add(string2);
        song.add(string3);
        song.add(string3);
        song.add(string4);
        song.add(string4);
        ArrayList<String> song2 = new ArrayList<>();
        song2.addAll(song);

        ArrayList<String> song3 = new ArrayList<>();
        for (int i = 0; i < song.size(); i++) {
            if (song.get(i).length() >= 15) {
                song3.add(song.get(i));
            }
        }
        System.out.println(song3);
        for (int i = 0; i < song3.size(); i++) {
            song3.remove("И сказал ты мне");
        }
        System.out.println(song3);
    }
}
