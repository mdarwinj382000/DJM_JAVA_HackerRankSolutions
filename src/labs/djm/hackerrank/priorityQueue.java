package labs.djm.hackerrank;

import java.util.*;

class Std {
    private String Name;
    private int id;
    private float cgpa;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}

class Priorities {
    List<String> datas = new ArrayList<>();
    List<Std> students;
    Queue<Std> pq = new PriorityQueue<>(5, Comparator.comparing(Std::getCgpa).reversed()
                                                     .thenComparing(Std::getName)
                                                     .thenComparing(Std::getId));

    public List<Std> getStudents(List<String> events) {
        datas = events;
        process();
        return students;
    }

    private void process() {
        for (String temp : datas) {
            String[] arr;
            arr = temp.split(" ");
            switch (arr[0]) {
                case "ENTER" -> {
                    Std tmp = new Std();
                    tmp.setName(arr[1]);
                    tmp.setCgpa(Float.parseFloat(arr[2]));
                    tmp.setId(Integer.parseInt(arr[3]));
                    pq.add(tmp);
                }
                case "SERVED" -> pq.poll();
            }
        }
        students= new ArrayList<>(pq);
        students.sort( Comparator.comparing(Std::getCgpa).reversed()
                                  .thenComparing(Std::getName)
                                  .thenComparing(Std::getId));
    }

}

class priorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Std> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Std st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
