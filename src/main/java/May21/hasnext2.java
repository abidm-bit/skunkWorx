package May21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hasnext2 {
    void main(){
        ArrayList<String> td = new ArrayList<>(List.of("tru red","bic","ticonderoga","staples"));
        System.out.println(td);
        Iterator<String> transformUC = td.iterator();
        while(transformUC.hasNext()){ if(transformUC.next().contains("a")){transformUC.remove();} }
        System.out.println("post transformation");
        System.out.println(td);
    }
}
