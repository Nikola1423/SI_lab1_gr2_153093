class Faculty {
    List<Student> students;
    String name;

    public Faculty(List<Student> studentList, String name) {
        this.students = studentList;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}