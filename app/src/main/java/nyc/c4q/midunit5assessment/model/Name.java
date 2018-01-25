package nyc.c4q.midunit5assessment.model;

/**
 * Created by c4q on 1/24/18.
 */

public class Name {
    private String title;
    private String last;
    private String first;

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
        }

        public String getLast ()
        {
            return last;
        }

        public void setLast (String last)
        {
            this.last = last;
        }

        public String getFirst ()
        {
            return first;
        }

        public void setFirst (String first)
        {
            this.first = first;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [title = "+title+", last = "+last+", first = "+first+"]";
        }
}

