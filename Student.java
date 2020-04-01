class Student {
    String index;
    String firstName;
    String lastName;
    ArrayList<Integer> grades;

    //TODO constructor
    public Student(String index, String firstName, String lastName, ArrayList<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }
    //TODO setters & getters

    // Getters
    public String getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // Setters
    public void setIndex(String newIndex) {
        this.index = newIndex;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setGrades(ArrayList<Integer> newGrades) {
        this.grades = new ArrayList<Integer>(newGrades);
    }

    //functions
    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < getGrades().size(); i++) {
            sum += getGrades().get(i);
        }
        return sum / getGrades().size();
    }

    public int ECTSCredits() {
        return getGrades().size() * 6;
    }
}
