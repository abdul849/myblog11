package myblog.myblog.SteamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
      //  List<String> list = Arrays.asList("stAlin","aDam,","sMith");
          //      List<String> newdata=list.stream().filter(i->i.endsWith("s")).collect(Collectors.toList());
       // List<Integer> newdataa=list.stream().map(integer -> integer+10).collect(Collectors.toList());
       // Function<Integer,Integer> data= s->s+10;
      //  Integer val=data.apply(val:30);
        // List<String> collect = list.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
        List<Integer> list = Arrays.asList(9, 3, 2,2,4,50, 5, 4, 8, 40, 3, 27, 44, 1, 33);
       // List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
       // Predicate<Integer> data= y->y%2==0;
        List<Integer> evenNumber=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);
        List<Integer> oddNumber=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(oddNumber);
        List<Integer> sortrdAndDistinctnumber = list.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(sortrdAndDistinctnumber);
    }
}
