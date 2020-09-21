/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Bill Crosbie
 * @version Feb 4, 2019
 * @Modified by Brian McMahon G00274188 9/21/2020 for the OOP P2
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    //Added pages to satisfy 2.85
    //Added refNumber to satisfy 2.88
    //Added borrowed to satisfy 2.91
    //Added courseText to satisfy 2.92
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourse)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookCourse;
    }
    
    // Add the methods here ...
    // These were included in the repository and satisfy 2.83
    /**
     * Provide access to the string holding the author's name
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
        /**
     * Provide access to the string holding the book's title
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    //The printAuthor and printTitle methods to satify 2.84
    /**
     * Prints the authors name
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    /**
     * Prints the title of the book
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    //getPages method to satisfy 2.85
    /**
     * Returns the number of pages the book contains
     */
    public int getPages()
    {
        return pages;
    }
    
    //The answer for 2.86 is the class at the point of this exercise is 
    //immutable
    
    //the printDetails method to satisfy 2.87
    //Modified to satisfy 2.89
    //Modified to satisfy 2.91
    /**
     * Prints the books details in a formatted way
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ",");
        System.out.println("Pages: " + pages);
        if(refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else
            System.out.println("zzz");
        System.out.println("Amount of times borrowed: " + borrowed +
        " (zzz if never borrowed)");
    }
    //the setRefNumber getRefNumber methods to satisfy 2.88
    //setRefNumber modified to satisfy 2.90
    /**
     * Mutator method for setting the reference number of the book
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() > 3)
        {
            refNumber = ref;
        }
        else
            System.out.println("Reference number not long enough");
    }
    /**
     * Accessor method for the books reference number
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    //the getBorrowed and borrow methods to satisfy 9.91
    /**
     * Increases the amount of times the book was borrowed by 1
     */
    public void borrow()
    {
        borrowed += 1;
    }
    /**
     * Method to return the amount of times the book has been borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    //the isCourseText method to satisfy 2.92
    /**
     * This method returns true if the book is a course text and false if it 
     * is not
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
