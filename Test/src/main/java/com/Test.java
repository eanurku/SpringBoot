package com;

import org.springframework.util.StopWatch;

import java.util.regex.Pattern;

public class Test {

    private static final String WOMEN_REGEX_1 =
            "(\\s+[Ww][Oo][Mm][Ee][Nn]\\b)|(\\s+[Ww][Oo][Mm][Ee][Nn]\\s+)|(\\b[Ww][Oo][Mm][Ee][Nn]\\s+)|" +
                    "(\\s+\\([Ww][Oo][Mm][Ee][Nn]\\))|(\\s+\\([Ww][Oo][Mm][Ee][Nn]\\)\\s+)|(\\([Ww][Oo][Mm][Ee][Nn]\\)\\s+)|" +
                    "(\\s+[Ww]\\b)|(\\s+[Ww]\\s+)|(\\b[Ww]\\s+)|" +
                    "(\\s+\\([Ww]\\))|(\\s+\\([Ww]\\)\\s+)|(\\([Ww]\\)\\s+)|" +
                    "(\\s+[Ll][Aa][Dd][Ii][Ee][Ss]\\b)|(\\s+[Ll][Aa][Dd][Ii][Ee][Ss]\\s+)|(\\b[Ll][Aa][Dd][Ii][Ee][Ss]\\s+)|"+
                    "(\\s+\\([Ll][Aa][Dd][Ii][Ee][Ss]\\))|(\\s+\\([Ll][Aa][Dd][Ii][Ee][Ss]\\)\\s+)|(\\([Ll][Aa][Dd][Ii][Ee][Ss]\\)\\s+)|" +
                    "(\\s+[Ff][Ee][Mm][Ii][Nn][Aa]\\b)|(\\s+[Ff][Ee][Mm][Ii][Nn][Aa]\\s+)|(\\b[Ff][Ee][Mm][Ii][Nn][Aa]\\s+)|"+
                    "(\\s+\\([Ff][Ee][Mm][Ii][Nn][Aa]\\))|(\\s+\\([Ff][Ee][Mm][Ii][Nn][Aa]\\)\\s+)|(\\([Ff][Ee][Mm][Ii][Nn][Aa]\\)\\s+)|"+
                    "(\\s+[Ll][Ff][Cc]\\b)|(\\s+[Ll][Ff][Cc]\\s+)|(\\b[Ll][Ff][Cc]\\s+)|"+
                    "(\\s+\\([Ll][Ff][Cc]\\))|(\\s+\\([Ll][Ff][Cc]\\)\\s+)|(\\([Ll][Ff][Cc]\\)\\s+)";


    final static String WOMEN_REGEX_2 =
            "(\\s+Women)|(\\s+Women\\s+)|(Women\\s+)|" +
                    "(\\s+\\(Women\\))|(\\s+\\(Women\\)\\s+)|(\\(Women\\)\\s+)|" +
                    "(\\s+W)|(\\s+W\\s+)|(W\\s+)|" +
                    "(\\s+\\(W\\))|(\\s+\\(W\\)\\s+)|(\\(W\\)\\s+)|" +
                    "(\\s+Ladies)|(\\s+Ladies\\s+)|(Ladies\\s+)|"+
                    "(\\s+\\(Ladies\\))|(\\s+\\(Ladies\\)\\s+)|(\\(Ladies\\)\\s+)|" +
                     "(\\s+Femina)|(\\s+Femina\\s+)|(Femina\\s+)|"+
                     "(\\s+\\(Femina\\))|(\\s+\\(Femina\\)\\s+)|(\\(Femina\\)\\s+)|"+
                    "(\\s+LFC)|(\\s+LFC\\s+)|(LFC\\s+)|"+
                    "(\\s+\\(LFC\\))|(\\s+\\(LFC\\)\\s+)|(\\(LFC\\)\\s+)";





//    static boolean f(String s) {
//        System.out.println("creating a value for \"" + s + '"');
//        return s.isEmpty();
//    }

    public static void main(String[] args) {

        Long longvalue=null;
        System.out.println(longvalue.longValue());

//        List<String> firstList=Arrays.asList("first","second","third","fourth");
//        List<String> secondList=Arrays.asList("first","second","sixth","seventh");
//
//        List<String> diffList = new ArrayList<>(CollectionUtils.disjunction(firstList, secondList));
//        System.out.println(diffList);
//
//        List<String> diffList2 = new ArrayList<>(CollectionUtils.removeAll(firstList, secondList));
//        System.out.println(diffList2);



       // System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("Kansas City NWSL w").find());

        //System.out.println("Kansas".matches("[A-Za-z]*]"));





        //System.out.println("ItalyWomen(U19)".toLowerCase().contains("women"));
       // String string="Ladies Targu Mures (ladieS) ind".replaceAll(WOMEN_REGEX_1,"");



//        StopWatch stopWatch=new StopWatch("test");
//        String string=null;
//        Pattern pattern = Pattern.compile(WOMEN_REGEX_1);
//
//        stopWatch.start("test 1");
//        for(int i=1;i<1000000;i++) {
//             string = "Ladies Targu Mures (ladieS) ind".replaceAll(WOMEN_REGEX_1,"");
//        }
//        stopWatch.stop();
//
//        stopWatch.start("test 2");
//        for(int i=1;i<1000000;i++) {
//            string = pattern.matcher("Ladies Targu Mures (ladieS) ind").replaceAll("");
//        }
//        stopWatch.stop();
//
//
//        System.out.println(string);
//        System.out.println(stopWatch.prettyPrint());
//

//        // positive scenario
//        Pattern pattern = Pattern.compile(WOMEN_REGEX_1);
//
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India     WoMen").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India    (Women)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India     w").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India    (W)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India     laDies").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India    (LadIEs)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India     femina").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India    (FeMIna)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India     lfc").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("India    (Lfc)").find());
//
//
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   WoMEn    (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   (WOMen) (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("West Adelaide    (WOMen)    (Reserves)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   laDies    (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   (laDies) (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("West Adelaide    (laDies)    (Reserves)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   FeMIna    (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   (FeMIna) (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("West Adelaide    (FeMIna)    (Reserves)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   lfc  dwrw  (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1 ,Pattern.CASE_INSENSITIVE).matcher("India   (lfc) rwrw (U19)").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1,Pattern.CASE_INSENSITIVE).matcher("West Adelaide wrwr   (lfc)  wrw  (Reserves)").find());
//
//
//
//
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("Women   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("(Women)   india").find());
//
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("w   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("(w)   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("laDies   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("(laDies)   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("femina   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("(femina)   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("lfc   india").find());
//        System.out.println(Pattern.compile(WOMEN_REGEX_1, Pattern.CASE_INSENSITIVE).matcher("(lfc)   india").find());
//
//
//
//        //negative scenario
//        System.out.println("----------------");
//        System.out.println(pattern.matcher("Swomenik").find());
//        System.out.println(pattern.matcher("Swomenik(women)").find());
//
//        System.out.println(pattern.matcher("womenswo ").find());
//        System.out.println(pattern.matcher("(women)swo ").find());
//
//        System.out.println(pattern.matcher("abcwomen swo ").find());
//        System.out.println(pattern.matcher("abcw swo ").find());
//        System.out.println(pattern.matcher("abclaDies swo ").find());
//        System.out.println(pattern.matcher("abcfemina swo ").find());
//        System.out.println(pattern.matcher("abclfc swo ").find());
//
//        System.out.println(pattern.matcher("abc(women) swo ").find());
//        System.out.println(pattern.matcher("abc(w) swo ").find());
//        System.out.println(pattern.matcher("abc(laDies) swo ").find());
//        System.out.println(pattern.matcher("abc(femina) swo ").find());
//        System.out.println(pattern.matcher("abc(lfc) swo ").find());

//        boolean containsWomen = "Italy Women (U19)".matches(".*[Ww][Oo][Mm][Ee][Nn].*");
//        System.out.println(containsWomen);

//        String str="U_19".replaceAll("_","");
//        System.out.println(str);


//        String string="Italy women (U19)".replaceAll("[Ww][Oo][Mm][Ee][Nn]","");
//        System.out.println(string);

////START
//        String tmsname="Italy";
//        String age="U19";
//        String gender="FEMALE";
//
//        String txoddsname="Italy";
//        String gendercatalog=null;



//        String searchquery="Albirex Niigata Male";
//        List<String> internalEntitites=Arrays.asList("Niigata Albirex Male");
//
//        List<BoundExtractedResult<String>> list = FuzzySearch.extractTop(searchquery, internalEntitites, internalEntity -> internalEntity.toString(), 95, 5);
//
//        int score1 = list.get(0).getScore();
//        String matchedinternalEntity = list.get(0).getReferent();
//
//        System.out.println("score1="+score1);
//
//
//        int score2 = FuzzySearch.tokenSortRatio("Stjordals-Blink", "Stjordals/Blink");
//        System.out.println("score2="+score2);
////END










































//        String joinedString = String.join(" ", "abc", "xyz");
//        System.out.println(joinedString);
//        String internalString="barca (19)";
//
//        boolean containingAgeGroup = Arrays.stream(AgeGroup.values())
//                .anyMatch(agegroup -> internalString.toLowerCase().contains(agegroup.name().toLowerCase()));
//
//        System.out.println(containingAgeGroup);
//        if(containingAgeGroup)
//        System.out.println(internalString.toLowerCase());

        //System.out.println(Long.parseLong(""));

//        String[] leaguesData = {};
//        leaguesData[0]="aa";
//        leaguesData[1]="aa";
//        leaguesData[2]="aa";
//        Arrays.stream(leaguesData).forEach(l->{
//            System.out.println("print");
//        });
//
//        String first=null;
//        String second=null;
//        if(first.equals(second)){
//            System.out.println("true");
//        }
//        else
//            System.out.println("false");
//        Period period=null;
//
//        switch(period){
//            case END:
//                System.out.println("END");
//                break;
//            case START:
//                System.out.println("start");
//                break;
//        }


//        long[][] migrateRegionIds={{34,38}};
//        Arrays.stream(migrateRegionIds).forEach(record-> System.out.println(record[0]+":"+record[1]));


//        System.out.println("123".compareTo(null));



//        DepartmentNew dep1=new DepartmentNew();
//        Set<Employee> employees=new LinkedHashSet<>();
//        employees.add(new Employee("123",null));
//
//        dep1.setEmployees(employees);
//
//        Employee val = Optional.ofNullable(dep1.getEmployees()).map(Collection::stream).orElseGet(Stream::empty)
//                .map(Optional::ofNullable)
//                .findFirst().orElseGet(Optional::empty).orElse(null);
//        System.out.println(val);

//        List<Employee> employees1=new ArrayList<>();
//        employees1.add(new Employee("123",""));
//        employees1.add(new Employee("111",null));
//        employees1.add(new Employee("33","abc"));
//        employees1.add(new Employee("551",""));
//        employees1.add(new Employee("11","xyz"));
        //Collections.sort(employees1,Comparator.comparing(Employee::getName,Comparator.nullsFirst(Comparator.naturalOrder())));
        //employees1.forEach(e-> System.out.println(e.getId()));


        //list to string collectionion
//        Set<Employee> employees2=new LinkedHashSet<>();
//        employees2.add(new Employee("123",""));
//        employees2.add(new Employee("111",null));
//        employees2.add(new Employee("33","abc"));
//        employees2.add(new Employee("551",""));
//        employees2.add(new Employee("11","xyz"));
//
//        String val = employees2.stream().map(e -> e.getName()).collect(Collectors.joining(","));
//
//        System.out.println(val);


        //get first element from map
//        DepartmentNew dep2=new DepartmentNew();
//        HashMap<String, Period> map = new HashMap<>();
//        Map.Entry<Integer, Period> first = Optional.ofNullable(dep2.getMymap()).orElseGet(Collections::emptyMap).entrySet()
//                .stream()
//                .map(Optional::ofNullable)
//                .findFirst().orElseGet(Optional::empty).orElse(null);
//
//                System.out.println(first);









//        String[] s=new String[]{"America is shit","india is avg","nothing is good avg"};
//        Arrays.stream(s).filter(str->str.contains("avg")).forEach(System.out::println);


//        Team team=Team.HOME;
//        System.out.println(team.toString());


        //        List<Long> list = new LinkedList<>();
        //        list.add(100L);
        //        list.add(90L);
        //        list.add(80L);
        //        list.add(70L);
        //        list.add(60L);
        //        list.add(50L);
        //
        //        List<Long> newList = new LinkedList<>(list);
        //
        //        System.out.println(list);
        //        System.out.println(newList);

//        LinkedList<Long> list = new LinkedList<>();
//        list.add(100L);
//        list.add(90L);
//
//        List<Long> newList = new LinkedList<>(list);
//        System.out.println(list);
//        System.out.println(newList);
//
//        int size = newList.size();
//        Long element = newList.remove(size - 1);
//        System.out.println(element);
//        System.out.println(list);
//        System.out.println(newList);
//
//        size = newList.size();
//        element = newList.remove(size - 1);
//        System.out.println(element);
//        System.out.println(list);
//        System.out.println(newList);
//
//        size = newList.size();
//        if (size > 0) {
//            element = newList.remove(size - 1);
//            System.out.println("ele=" + element);
//        }
//        System.out.println(list);
//        System.out.println(newList);
//

//        Stack<Long> stack=new Stack<>();
//        stack.push(2L);
//        stack.push(3L);
//
//        //System.out.println(stack);
//
//        Stack<Long> newStack = (Stack<Long>) stack.clone();
//
//      //  System.out.println(stack);
//        System.out.println(newStack);

//        ArrayList<Object> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        list.add("fourth");
//        list.add("fifth");
//        list.add("sixth");
//        list.add("seventh");
//
//        list.remove(0);
//        list.forEach(System.out::println);
//
//        Integer x=null;
//        if(x<0)
//        System.out.println(x);

//        String s="(Popup for yards and downs + name of Happening)";
//        System.out.println(s.split("\\+")[0]);
//        System.out.println("Anurag");



        //        List<String> list=new ArrayList<>();
        //        list.add("1");
        //        list.add("2");
        //        list.add("3");
        //        list.add("4");
        //        list.add("5");
        //        list.add("6");
        //        Optional<String> val = list.stream().filter(n -> Integer.parseInt(n) > 3).findAny();
        //        System.out.println(val);

        //        List<Message> messages = new LinkedList<>();
        //        messages.add(new Message(1, "1st sem"));
        //        messages.add(new Message(2, "2nd sem"));
        //        messages.add(new Message(3, "3rd sem"));
        //        messages.add(new Message(4, "4th sem"));
        //        messages.add(new Message(5, "5th sem"));
        //        messages.add(new Message(6, "6th sem"));
        //
        //        for (ListIterator<Message> it = messages.listIterator(messages.size()); it.hasPrevious(); ) {
        //            Message bookieMessage = it.previous();
        //            boolean isfound = bookieMessage.getId() == 3;
        //            if (isfound) {
        //                it.remove();
        //                break;
        //            }
        //            String[] firstPart = bookieMessage.getText().split(" ");
        //            String str= firstPart[0].replaceAll("[^0-9]","");
        //
        //            int val = Integer.parseInt(str);
        //
        //        }
        //
        //       messages.forEach(System.out::println);


    }
}
