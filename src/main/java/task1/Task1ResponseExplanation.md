# My Responses to Task 1

## Task 1 Overview

With my response to The questions that are part of task one, I have kept the original `studentEnroll.java` a file in the `Original` package.

The refactored and modified `studentEnroll.java` java coding for  that shows the preconditions, per conditions and identified invariants is given in the refactored package. Please refer to this package. In addition I have also created Driver test application as well.

The purpose of designed by contract, is to provide defensive programming so as to prevent the Application program from failing. We do this by defining preconditions, Post conditions, and conditions for invariance.

Here the use of Pre-conditions  in this application :
- Conditions that must be true before a method or function is executed.
- An example: Before withdrawing money from a bank account, a precondition might be that the withdrawal amount must be non-negative.
- The method tells clients this is what I expect from you.

Here the use of Post-conditions in this application:
- Conditions that must be true after a method or function has executed.
- An example: After a successful login, a postcondition might be that the user is granted access to certain functionalities.
- The method tells clients this is what I promise to do for you.

Here the use of Invariants in this application:
- Are the things that are always true and won't change.
- Conditions that must always be true throughout the execution of a class or module.
- An example:  In a shopping cart class, an invariant could be that the total cost of items in the cart is always non-negative.
- The method tells clients if this was true before you called me, I promise it'll still be true when I'm done.
- Invariants: as this process is about enrolling, it is not about withdrawing with no core, or no elective, ie core = 0, or elective = o, that is core >  1, elective > 1, or core > = 2, elective > = 1

## My Response to Task1.Question 1.1


### conditions on `public void addCore(String core)`

Preconditions, with this:

- The course exist, @pre.condition: that “core” Selected Is contained in The courses offered “cores offered”
- Number of courses and electives chosen must be no more than 7> A student can choose a maximum of seven courses and electives.

- The student must twice as many courses than electives

Post conditions, with this:

- Number of courses and electives chosen must be no more than 7> A student can choose a maximum of seven courses and electives
- The student must choose twice as many courses than electives
- A student must have selected the number of electives that is less than half the number of courses.
- The student has chosen a course

Invariants, With this:

- Invariants: as this process is about enrolling, it is not about withdrawing with no core.
- A student must have chosen at a minimum two courses, [ and one elective] core >  =2




### conditions `public void addElective(String elective)`

Preconditions, with this:
- The elective Must exists
- Number of courses and electives chosen must be no more than 7> A student can choose a maximum of seven courses and electives

- The student must have chosen less than half the number of electives to courses.


Post conditions, with this:
- Number of courses and electives chosen must be no more than 7> A student can choose a maximum of seven courses and electives

- The student must have chosen less than half the number of electives to courses.

- The student has chosen an elective


Invariants, with this:
- Invariants: as this process is about enrolling, it is not about withdrawing with no core.

- A student must have chosen at a minimum two courses, [ and one elective]

- electives >= 1


### conditions `public void removeCore(String core)`

Preconditions, with this:
- The course exist, @pre.condition: that “core” Selected Is contained in The courses offered “cores offered
- There must sufficient core units to withdraw
- There Be more than twice as many Core units  as elective units
- The number of electives Is always less than half the number of core units selected

Post conditions, with this:
- The number of Core unit has been reduced by one.

Invariants, with this:
- Invariants: as this process is about enrolling, it is not about withdrawing with no core.
- A student must have chosen at a minimum two courses, [ and one elective]
- core >  =2



### conditions `public void removeElective(String elective)`

Preconditions, with this:
- The elective Must exists
- There must be sufficient elective units to remove such that the number of elective units is always less than equal to half the number of core units.

Post conditions, with this:
- The number of elective units has been reduced by one.

Invariants, with this:
- Invariants: as this process is about enrolling, it is not about withdrawing with no core.
- A student must have chosen at a minimum two courses, [ and one elective]
- electives >= 1



## My Response to Task1.Question 1.2

**Write the class invariants:**

As this is involved in enrolling a student in Even if A student removes a core subject or an elective subject, at the end of this process there has to be a non-zero Number of core subjects and elective subjects.



## My Response to Task1.Question 1.3

Specify invariants, preconditions and post-conditions as comments using the Javdoc annotations respectively (in the spaces provided):

- `@invariant`

- `@pre.condition`

- `@post.condition`

*MJL: Done*

-----------
You may use the notation OLD.cores in the post-conditions to refer to the original value for cores.


   *MJL: Accknowledged*

-----------

Please note that duplicate conditions will cause 0 mark for the corresponding part.

  *MJL: Accknowledged, I have to find the appropriate pre-and post conditions where they are required.*
OhOK

