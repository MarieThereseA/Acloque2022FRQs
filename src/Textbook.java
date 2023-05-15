public class Textbook extends Book {
    private int edition;

    public Textbook(String title, double price, int edition){
        super(title, price);
        this.edition = edition;
    }

    public int getEdition(){
        return edition;
    }

    public String getBookInfo(){
        return super.getBookInfo() + " -" + edition;
    }

    public boolean canSubstituteFor(Textbook sub){
        boolean valid = false;
        if (this.getTitle().equals(sub.getTitle())){
            if(this.getEdition() >= sub.getEdition()){
                valid = true;
            }
        }
        return valid;
    }
}
