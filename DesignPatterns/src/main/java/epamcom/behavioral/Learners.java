package epamcom.behavioral;

public class Learners implements GettingIteratorStream {
	  public String[] students = {"A","B","C","D","E","F"};
		public Iterator getItr() {
			return new StudentsIterator();
		}
		private class StudentsIterator implements Iterator {
			  int index;
		      public boolean hasnext() {
		          if(index < students.length) {
		              return true;
		          } 
		          return false;
		      }  
		      public Object next() {
		          if(this.hasnext()) {
		              return students[index++];
		          }
		          return null;
		      }
		}
}