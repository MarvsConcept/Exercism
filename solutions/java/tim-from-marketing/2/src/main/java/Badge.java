class Badge {
    public String print(Integer id, String name, String department) {
        //throw new UnsupportedOperationException("Please implement the Badge.print() method");

        String dept = (department == null) ? "OWNER" : department.toUpperCase();

        return(id == null) ? name + " - " + dept : "[" + id + "] - " + name + " - " + dept;
    }
}
