# BackEndSpringRestCRUD

- Proyecto JAVA con uso de Spring Framework y base de datos h2. El frontEnd esta disponible en: https://github.com/lmarcela/FrontEndAngularRestCRUD

- Proyecto basado en https://www.youtube.com/watch?v=ioYJx-rNNoI&index=1&list=PLF0fAweo0Kogzy5I6LxEaIlJAxVORXZm-

## Funcionamiento de los metodos del controlador 

### METODO GETUSERS
Código:

	@GetMapping("/")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
Prueba del funcionamiento con Postman:	
![getUsers()](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/1.png)


…or create a new repository on the command line

echo "# BackEndSpringRestCRUD" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/lmarcela/BackEndSpringRestCRUD.git
git push -u origin master
…or push an existing repository from the command line

git remote add origin https://github.com/lmarcela/BackEndSpringRestCRUD.git
git push -u origin master
…or import code from another repository
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.


CREAR PROYECTO ANGULAR (RESTCLIENT): ng new FrontEndAngularRestCRUD (Creado dentro de la carpeta \src\main\resources\static).
ABRIR PROYECTO EN VSCODE DESDE CONSOLA: code . (Dentro de la carpeta src\main\resources\\static\FrontEndAngularRestCRUD).
BOOTSTRAP: npm install bootstrap@next --save (Dentro de la carpeta src\main\resources\\static\FrontEndAngularRestCRUD).

ANGULAR:
- CREAR CLASE: ng g class user
- CREAR COMPONENTE SIN ARCHIVOS CSS Y SPEC: ng g c components/listuser --spec false -is
- CREAR SERVICIO SIN SPEC: ng g s services/user --spec false


https://www.youtube.com/watch?v=mnzMx3hh6rg&list=PLF0fAweo0Kogzy5I6LxEaIlJAxVORXZm-&index=2



	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		userRepository.delete(id);
		return true;
	}

	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		return userRepository.save(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user){
		return userRepository.save(user);
	}