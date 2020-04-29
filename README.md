# SER316-Assignment6

Screencast link: https://youtu.be/95e7PdeIry4

The 3 design patterns are interwoven into one cohesive main.

Design Pattern 1: Abstract factory for creating the different animals and crops objects
  -Both AnimalFactory and CropFactory extend AbstractFactory. I have the FactoryProducer class create the type of factory I need depending on the value of the "Animal" boolean. Specific resources such as "horse" and "corn" are specified in the ResourceGenerator class.
  --Requirements met with pattern:
    1. Farms can be of different types, such as an animal farm, a crop farm, a hybrid farm
    and so on. You can choose to make something up too.
    2. Animals reside on farms; it is up to you to decide the total number of animals that
    your farm(s) will hold. Think of typical farm animals such a cows and pigs, but you
    can be creative if you wish.


Design Pattern 2: The observer design pattern is used for controlling the daytime and nighttime events.
  -The farm is set up as an observable object.
  -DayEvents and NightEvents is set up as an observer and added to the farm using addObserver(Observable o).
  -Their update method is called when the farm calls setChanged() and notifyObservers().
  --Requirements met with pattern:
    3. The simulation should run on cycles. A cycle is considered to be of 2 parts - 1 day
    time and 1 night time.
    4. Passive currency is earned with each new day (not night). This passive currency
    income is generated from selling crops or animal products, or both depending on
    your farm.
    5. Farms are automatically upgraded once the farm has acquired enough currency. This
    could mean that the farm is expanded to grant it more land, which allows it to hold
    a greater numbers of farmers, animals and crops. The upgrade may also increase the
    passive currency income. In order for the simulation to not run into issues, it might
    be a nice idea to make sure the farm only upgrades once your farm has acquired 20%
    (choose any % you like though) more than the cost of an upgrade. So, if an upgrade
    costs $1000, it will automatically upgrade at $1200 so the farm still has $200.
    6. During night cycles predators come out.

Design Pattern 3: Decorator design pattern for attributes of the resources
  -The animals have Decorator wrapper classes that specify the attributes of the resources.
  -In the horse class, a horse can have a wrapper that specifies if it is fast, slow. or average.
  --Requirements met with pattern:
    7. Similar to farmers, animals have affinities too
    8. More currency can be made from farmer, animal or crop affinities (examples below).
    9. Animal product (milk, wool, and so on) is replenished after every 2nd day. For
    example, if a sheep is sheared for its wool then the farmers must wait 2 cycles (day
      and night) to collect the wool again.
