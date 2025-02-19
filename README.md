# README #

This readme will document whatever steps are necessary to get PetStore running.  

### What is this repository for ###

This code covers the exercise 3 related to data in APIs. Section 3 related to how many pets have the same name is included in here.   
As there is a dependency with the other sections what we have done is create the following structure:  

PetStoreProject/    
  
- Pet.java               # Clase que representa una mascota  
- PetStore.java          # Obtiene datos desde la API  
- PetNameCounter.java   # Procesa y cuenta los nombres repetidos  
- Main.java             # Clase para ejecutar el programa  
- pom.xml                            # Archivo de Maven para gestionar dependencias  
- README.txt                         # Archivo con instrucciones para ejecución en IntelliJ IDEA  

  
The logic has been splitted by classes.  

### Download and installation ###

Download the corresponding git repository from the main branch: https://github.com/angvazcar/PetStore/tree/main  
Execute the following comands on your prompt/terminal:  

_git clone https://github.com/angvazcar/PetStore.git_

### Preconditions before code execution ###

*  Have Java version 11 or higher installed (you can download from here https://www.oracle.com/java/technologies/downloads/#java11?er=221886
*  Have IntelliJ IDEA installed
* Have Maven installed

### Usage and code execution ###

* Open the project downloaded in the previous steps with IntelliJ (File--> Open and select the downloaded code)  
* In IntelliJ terminal run:  
_mvn clean install_
* Open Main.java in IntelliJ  
* Click on the run green button on the left of the code line _public static void main(String[] args)_ (if you do not see it in the top right corner,right click on Main.java and select Run 'Main.main()')  


Once the execution has finshed you will see an exit like:    

Frecuencia de nombres de mascotas vendidas:  

{Perchik=1, Лео=1, Chapi dog 67=1, Pet_47123=1, Pet_47122=1, Pet_47121=1, UpdatedDog=2, scittles=1, Милси=1, Боня=1, Тимоша=1, Акела=1, vasyaupdate=1, PetName_46788=1, Sin nombre=1, Изюм=1, hello kity=11, PetName_46782=1, PetName_46781=1, fghgfh=1, Kitty=1, Hardy=1, Azirafael=1, Мася=1, Grivei update=1, Василий=1, tg7YdN1DnM=1, мурзик 2=1, doggie=9, fish=1, King Kong=1, Котенок=1, dog=1, 5tRIlk9Z33=1, BlVQyeGcvQ=1}  

Process finished with exit code 0

