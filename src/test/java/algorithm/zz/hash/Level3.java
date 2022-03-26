package algorithm.zz.hash;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Level3 {

    @Test
    void test() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        Integer[] plays = {500, 600, 150, 800, 1500};

        Map<String, Integer> totalPlays = genreTotalPlay(genres, plays);

        List<String> genreRank = new ArrayList<>(totalPlays.keySet());
        genreRank.sort((value1, value2) -> (totalPlays.get(value2).compareTo(totalPlays.get(value1))));

        Map<Integer, Integer> songId = new HashMap<>();

        List<Integer> result = rank(genres, plays, genreRank, songId);

        result.stream().mapToInt(r -> r).toArray();
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    private Map<String, Integer> genreTotalPlay(String[] genres, Integer[] plays) {
        Map<String, Integer> totalPlays = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (totalPlays.get(genres[i]) != null) {
                totalPlays.put(genres[i], (totalPlays.get(genres[i]) + plays[i]));
            } else {
                totalPlays.put(genres[i], plays[i]);
            }
        }
        return totalPlays;
    }

    private List<Integer> rank(String[] genres, Integer[] plays, List<String> genreRank, Map<Integer, Integer> songId) {

        List<Integer> result = new ArrayList<>();
        for (String genre : genreRank) {
            for (int i = 0; i < genres.length; i++) {
                if (genre.equals(genres[i])) {
                    songId.put(i, plays[i]);
                }
            }
            List<Integer> sortList = new ArrayList<>(songId.keySet());
            sortList.sort((value1, value2) -> (songId.get(value2).compareTo(songId.get(value1))));

            addRank(result, sortList);

            songId.clear();
        }
        return result;
    }

    private void addRank(List<Integer> result, List<Integer> sortList) {
        if (sortList.size() < 2) {
            result.addAll(sortList);
        } else {
            result.add(sortList.get(0));
            result.add(sortList.get(1));
        }
    }
}
