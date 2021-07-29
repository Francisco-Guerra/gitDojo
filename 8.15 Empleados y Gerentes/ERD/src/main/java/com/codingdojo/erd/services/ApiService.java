package com.codingdojo.erd.services;

@Service
public void employees() {
    Manager manager = managerRepo.findOne(Long.valueOf(1));
    System.out.println(manager.getEmployees());
    
    //Esto imprimirá el nombre del usuario 2 y 3. Todos los usuarios que son amigos de este usuario.  
    for(Manager m : manager.getEmployees()) {
        System.out.println(m.getFirstName());
    }
    
    // Esto solo imprimirá el nombre del usuario 2.
    for(Manager m : manager.getManagerEmployees()) {
        System.out.println(m.getFirstName());
    }
}
