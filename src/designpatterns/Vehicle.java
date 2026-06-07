package designpatterns;
// Template Method pattern (basic idea).
public abstract class Vehicle {
/*Why Make start() Abstract?

Because starting behavior varies by vehicle type.

Car → ignition system

Bike → kick or self-start

Electric vehicle → battery activation

So the base class enforces:

Every vehicle must define how it starts.

This is enforcing a contract.

Why Make stop() Final?

Because stopping behavior might be:

Standardized

Safety-critical

Not allowed to change

Already fully defined

The designer wants to guarantee:

All vehicles stop the same way.

So subclasses cannot override and accidentally change or break it.

🔥 What Principle Is Being Applied?

Controlled extensibility.

The base class:

Allows variation where necessary (start)

Prevents variation where dangerous (stop)

This protects invariants.

This Pattern Is Very Common

It is called:

Template Method pattern (basic idea).

Where:

Some methods are fixed (final)

Some methods are customizable (abstract)

It ensures structure while allowing specialization.

Interview-Level Answer

You could say:

The designer makes start() abstract to force subclasses to provide specific starting behavior, while making stop() final to enforce consistent and safe stopping behavior across all implementations.*/
    public abstract void start();

    public final void stop(){
        System.out.println("stop the vehicle ");
    }

}
