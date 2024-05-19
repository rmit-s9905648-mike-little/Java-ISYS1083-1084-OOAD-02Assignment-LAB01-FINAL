package task1.refactored;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class StudentEnrol
{
    //----------------------------------------------------------
    // state variables
    private final Set<String> coresOffered = new HashSet<String>(Arrays.asList("P1", "OS", "SEF", "DC", "WP"));
    private final Set<String> electivesOffered = new HashSet<String>(Arrays.asList("C++", "PHP", "Web3D", "ICT", "AI"));

    private Set<String> cores = new HashSet<String>();
    private Set<String> electives = new HashSet<String>();



    //--------------------------------------------------------------------------------------
    public void addCore(String core)
    {
        //--------------------------------------------------------------------------------------
        // Add core
        /*+
        * This method Will add the selected Course By the student To theList of Courses they have chosen

        ### conditions on `public void addCore(String core)`

        Preconditions, with this:

        - The course exist, @pre.condition: that “core” Selected Is contained in The courses offered “cores offered”
        - Number of courses and electives chosen must be no more than 7> A student can choose a maximum of seven courses and electives.

        - The student must twice as many courses than electives

        Post conditions, with this:

        - Number of courses and electives chosen must be no more than 7> A student can choose a maximum of seven courses and electives
        - The student has chosen a course

        Invariants, With this:
        - Invariants: as this process is about enrolling, it is not about withdrawing with no core.
        - A student must have chosen a core

     */
        // @pre.condition: that “core” Selected Is contained in The courses offered “coresOffered”
        assert coresOffered.contains(core) : "course chosen must exist";
        if (!coresOffered.contains(core) )
        {
            // 'core' is not contained in 'coresOffered'
            System.out.println("chosen course is not correct");


        }// close if (!coresOffered.contains(core) )
        else
        {

            int cores_size_init =cores.size();
            int cores_size_final = 0;
            int electives_size =electives.size();
            //@pre.condition: - Number of courses and electives chosen must be no more than 7
            //   A student can choose a maximum of seven courses and electives
            assert ((cores_size_init + electives_size)<=7) : "Number of selected cores and electives must be less than seven";
            if ( !((cores_size_init + electives_size)<=7) )
            {
                System.out.println("cannot choose more than seven cores and electives");

            }// close if ( !((cores_size + electives_size)<=7) )
            else
            {
                //@pre-condition: ( cores_size >= (electives_size_init*2)   )
                //======>> need to include The student must have chosen more
                // twice the number of cores to electives

                // (cores_size_init >= (electives_size*2) )
                cores.add(core);
                assert (cores_size_init >= (electives_size*2)):"Too many cores to electives chosen";
                if ( cores_size_init < (electives_size*2) )
                {
                    System.out.println("Too many cores to electives chosen");

                }// close if (cores_size_init <= (electives_size*2) )
                else
                {
                    //(cores_size_init >= (electives_size*2))
                    // core exists in 'coresOffered', add to the list of selected cores.
                    System.out.println("core chosen");

                    // @post.condition: the student has chosen an elective.
                    cores_size_final = cores.size();
                    assert  (cores_size_final < cores_size_init): "student has not chosen a core";
                    if (cores_size_final > cores_size_init)
                    {
                        System.out.println("student chose a core");

                    }// close if (electives_size_final > electives_size_init)

                }//close (cores_size >= (electives_size_init*2)

            } // close if ( ((cores_size + electives_size)<=7) )

        } // close (coresOffered.contains(core) )


        //@invariant: A student must have chosen a core
        assert (cores.size()>0) : "A student must have chosen a core";

    }// close  public void addCore(String core)

    //--------------------------------------------------------------------------------------
    public void addElective(String elective)
    {
        //--------------------------------------------------------------------------------------
        /*+
        * This method will add an Elective
        *
        ### conditions `public void addElective(String elective)`

	    Preconditions, with this:
	    - The elective Must exists
	    - Number of courses and electives chosen must be no more than 7>
	        A student can choose a maximum of seven courses and electives
	    - The student must have chosen less than half the number of electives to courses.


	    Post conditions, with this:
	    - Number of courses and electives chosen must be no more than 7>
	        A student can choose a maximum of seven courses and electives
	    - The student must have chosen less than half the number of electives to courses.
	    - The student has chosen an elective


	    Invariants, with this:
	    - Invariants: as this process is about enrolling, it is not about withdrawing with no core.
	    - A student must have chosen at a minimum two courses, [ and one elective]
	    - electives >= 1

     */

        /*
        Preconditions, with this:
	    - The elective Must exists
	    - Number of courses and electives chosen must be no more than 7>
	    - The student must have chosen less than half the number of electives to cores.
         */

        //@pre-condition: that “elective” Selected Is contained in The electives offered “electivesOffered”
        if (!electivesOffered.contains(elective) )
        {
            // 'core' is not contained in 'electivesOffered'
            System.out.println("chosen elective is not correct");

        }// close if (!electivesOffered.contains(elective) )
        else
        {
            // implementation here.
            int electives_size_init =electives.size();
            int electives_size_final = 0;
            int cores_size =cores.size();
            //@pre.condition: - Number of courses and electives chosen must be no more than 7
            //   A student can choose a maximum of seven courses and electives
            assert ((electives_size_init + cores_size)<=7) : "Number of selected cores and electives must be less than seven";
            if ( !((electives_size_init + cores_size)<=7) )
            {
                System.out.println("cannot choose more than seven cores and electives");

            }// close if ( !((cores_size + electives_size)<=7) )
            else
            {
                //@pre-condition: (electives_size_init <= (cores_size/2) )
                // No more than half the number of electives to cores
                // (electives_size_init <= (cores_size/2) )
                assert (electives_size_init >= (cores_size/2)):"Too many electives chosen comparted to cores";
                if (electives_size_init >= (cores_size/2))
                {
                    System.out.println("too many electives chosen comparted to cores");

                }// close if (electives_size_init >= (cores_size/2))
                else
                {
                    //(electives_size_init <=(cores_size/2))
                    // elective exists in 'electivesOffered', add to the list of selected cores.
                    electives.add(elective);
                    System.out.println("elective chosen");

                    // @post.condition: the student has chosen an elective.
                    electives_size_final = electives.size();
                    assert  (electives_size_final < electives_size_init): "student has not chosen an elective";
                    if (electives_size_final > electives_size_init)
                    {
                        System.out.println("student chose an elective");

                    }// close if (electives_size_final > electives_size_init)

                }//close (electives_size_init <=(cores_size/2))

            }// close if ( ((cores_size + electives_size)<=7) )

        } // close (electivesOffered.contains(elective) )


        //@invariant
        /*
        - Invariants: as this process is about enrolling, it is not about withdrawing with no core.
	    - A student must have chosen at a minimum one elective
	    - electives >= 1
         */
        //@invariant: A student must have chosen an elective
        assert (electives.size()>0) : "A student must have chosen an elective";


    }// close public void addElective(String elective)


    //--------------------------------------------------------------------------------------
    public void removeCore(String core)
    {
        //--------------------------------------------------------------------------------------
        /*+
        * This method will remove a chosen course "core"
        *
        ### conditions `public void removeCore(String core)`

	    Preconditions, with this:
	    - The course exist, @pre.condition: that “core” Selected Is contained in The courses offered “cores offered
	    - There Be more than twice as many Core units  as elective units
	    - There must sufficient core units to withdraw

	    Post conditions, with this:
	    - The number of Core unit has been reduced by one.


	    Invariants, with this:
	    - Invariants: as this process is about enrolling, it is not about withdrawing with no core.
	    - A student must have chosen at a minimum two courses, [ and one elective]
	    - core >  =2

        */
        // @pre.condition: that “core” Selected Is contained in The courses offered “coresOffered”
        int cores_size_init =cores.size();
        int cores_size_final = 0;
        int electives_size =electives.size();

        assert coresOffered.contains(core) : "course chosen must exist";
        if (!coresOffered.contains(core) )
        {
            // 'core' is not contained in 'coresOffered'
            System.out.println("chosen course is not correct");


        }// close if (!coresOffered.contains(core) )
        else
        {
            //@pre,condition: There Be more than twice as many Core units  as elective units in order to remove
            if ( cores_size_init < (electives_size*2) )
            {
                System.out.println("Not enough cores to remove");

            }// close if (cores_size_init <= (electives_size*2) )
            else
            {
                // @post.condition: the core has been removed..
                // ( cores_size_init > (electives_size*2) )
                cores.remove(core);
                cores_size_final = cores.size();
                assert  (cores_size_final < cores_size_init): "a core is removed";
                if (cores_size_final < cores_size_init)
                {
                    System.out.println("a core is removed");

                }// close if (electives_size_final > electives_size_init)

                // @post.condition: the student has removed a core.


            }//close if ( cores_size_init > (electives_size*2) )

        }// close if (coresOffered.contains(core) )


        //@invariant: A student must have chosen a core
        assert (cores.size()>0) : "A student must have chosen a core";

    }// close  public void removeCore(String core)


    //--------------------------------------------------------------------------------------
    public void removeElective(String elective)
    {
        //--------------------------------------------------------------------------------------
        /*+
        * This method will remove a chosen course "core"
        *
        ### conditions `public void removeCore(String core)`

	    Preconditions, with this:
	    - The course exist, @pre.condition: that “core” Selected Is contained in The courses offered “cores offered
	    - There Be more than twice as many Core units  as elective units
	    - There must sufficient core units to withdraw

	    Post conditions, with this:
	    - The number of Core unit has been reduced by one.


	    Invariants, with this:
	    - Invariants: as this process is about enrolling, it is not about withdrawing with no core.
	    - A student must have chosen at a minimum two courses, [ and one elective]
	    - core >  =2

        */
        // @pre.condition: that “elective” Selected Is contained in The electives offered “electivesOffered”
        int electives_size_init =electives.size();
        int electives_size_final = 0;

        int cores_size =cores.size();

        assert electivesOffered.contains(elective) : "elective chosen must exist";
        if (!electivesOffered.contains(elective) )
        {
            // 'core' is not contained in 'coresOffered'
            System.out.println("chosen elective is not correct");


        }// close if (!coresOffered.contains(core) )
        else
        {
            ////////======>> ======>>
            //@pre,condition: There always be no more than half the number of electives to cores
            //@pre-condition: (electives_size_init <= (cores_size/2) )

            // (electives_size_init < (cores_size/2) )
            assert (electives_size_init < (cores_size/2)):"Not enough electives to remove compared to cores";


            if ( electives_size_init < (cores_size/2) )
            {
                System.out.println("Not enough electives to remove");

            }// close if (electives_size_init < (cores_size/2) )
            else
            {
                // @post.condition: the core has been removed..
                // (  electives_size_final < electives_size_init  )
                electives.remove(elective);
                electives_size_final = electives.size();
                assert  (electives_size_final < electives_size_init): "an elective is removed";
                if (electives_size_final < electives_size_init)
                {
                    System.out.println("an elective is removed");

                }// close if (electives_size_final < electives_size_init)


            }//close if ( electives_size_init > (electives_size*2) )

        }// close if (coresOffered.contains(core) )


        //@invariant: A student must have sufficient  electives chosen
        assert (cores.size()>0) : "A student must have sufficient  electives chosen";

    }// close  public void removeCore(String core)


    //--------------------------------------------------------------------------------------
    // Listing all courses enrolled
    public void display()
    {
        for (String course : cores) System.out.println(course);
        for (String course : electives) System.out.println(course);
    }
}// close class StudentEnrol
