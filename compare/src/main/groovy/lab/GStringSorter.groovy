package lab

/**
 * Created by joao on 11/02/15.
 */
class GStringSorter {

    List<String> sortAlpha(List<String> strings) {
        strings.sort()
    }

    List<String> sortByDescLength(List<String> strings) {
        Collections.sort(strings, {s1,s2 -> s2.size() - s1.size()} as Comparator)
        strings
    }

    List<String> sortByAscLength(List<String> strings) {
        strings.sort { it.length() }
    }
}
