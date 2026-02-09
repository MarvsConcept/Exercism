class Badge {
    public String print(Integer id, String name, String department) {
        //throw new UnsupportedOperationException("Please implement the Badge.print() method");

        String dept = (department == null) ? "OWNER" : department.toUpperCase();
        
        if (id == null) {
            return name + " - " + dept; 
        }        

        return "[" + id + "] - " + name + " - " + dept;
    }
}
