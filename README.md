# SER316-Assignment6

I'm considering these design patterns for my code:

1. Abstract factory for creating the different animals and crops objects
  -I'm leaning towards an animal farm. Each animal will have a way of generating income

2. Either the State pattern or Observer pattern for keeping tracking of the farm's state (day/night cycle, capacity, age, etc)
  -When it is day, the daytime events observer will trigger daytime events
  -When it is night, the nighttime events observer will trigger nighttime events

3. Decorator pattern for attributes of the farmers and animals
  -Will attach attributes to the farmers and animals. These attributes will effect the income generated. Age will be tracked as an attribute.

4. Singleton for creating the single instance of the World
  -Not sure if this one really counts
