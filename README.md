Eclipse Plugin with modern model
------------
GOAL
This is plugin tutorial seed.

We aim to learn eclipse plugin feature development using modern plugin framework and IDE technololgy. 
At the time of this tutorial, 
- the PDE is version 3.14.300.v20200305-0155.
- JDK 8


The feature set in scope is a Multipage wizard to
1. choose container (from existing projects)
2. load json file
3. assign values to wizardpage fields
4. save fields to json file
5. Externalize properties
6. Plugin event logger

## Folder structure
- src - files location; supports maven nature at a later date
- icons - graphics for UI
- target - output location; supports maven nature at a later date
- libs - 3rd party jars, if needed
- etc - misc & docs
