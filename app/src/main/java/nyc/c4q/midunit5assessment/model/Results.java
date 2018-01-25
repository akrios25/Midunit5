package nyc.c4q.midunit5assessment.model;

/**
 * Created by c4q on 1/24/18.
 */

public class Results {
    private Picture picture;

    private String email;

    private Location location;

    private String cell;

    private String dob;

    private Name name;

    public Picture getPicture ()
    {
        return picture;
    }

    public void setPicture (Picture picture)
    {
        this.picture = picture;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public String getCell ()
    {
        return cell;
    }

    public void setCell (String cell)
    {
        this.cell = cell;
    }

    public String getDob ()
    {
        return dob;
    }

    public void setDob (String dob)
    {
        this.dob = dob;
    }

    public Name getName ()
    {
        return name;
    }

    public void setName (Name name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [picture = "+picture+", email = "+email+", location = "+location+", cell = "+cell+", dob = "+dob+", name = "+name+"]";
    }
}
