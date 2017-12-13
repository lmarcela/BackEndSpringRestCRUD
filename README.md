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



### METODO GETUSER
Código:

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
Prueba del funcionamiento con Postman:	

![getUser(@PathVariable Long id)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/2.png)


### METODO DELETEUSER
Código:

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		userRepository.delete(id);
		return true;
	}
	
Prueba del funcionamiento con Postman:	

![getUser(@PathVariable Long id)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/3.png)

### METODO CREATEUSER
Código:

	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
Prueba del funcionamiento con Postman:	

![createUser(@RequestBody User user)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/4.png)

### METODO UPDATEUSER
Código:

	@PutMapping("/user")
	public User updateUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
Prueba del funcionamiento con Postman:	

![updateUser(@RequestBody User user)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/5.png)



## Comandos de utilidad

Nota: Al crear repositorio en GitHub dice:

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

### COMANDOS PARA GIT

	VERSION: git --version
	USUARIO: git config --global user.name "Marcela Malaver"
	EMAIL: git config --global user.email "marcela9409@gmail.com"
	ALIAS PARA LOGIN: git config --global alias.lg "log --oneline --decorate --all --graph"
	ALIAS PARA STATUS: git config --global alias.s "status -s"
	VER URL REPOSITORIO: git remote -v
	PONER URL REPOSITORIO: git remote add origin https://github.com/lmarcela/BackEndSpringRestCRUD.git
	SUBIR CAMBIOS: git push -u origin master
	
	VER ESTADO DE GIT: git s
	AÑADIR ARCHIVOS AL GIT: git add .
	CREAR COMMIT CON MENSAJE: git commit -m "ESTE ES MI MENSAJE"
	SUBIR AL REPOSITORIO (REVISAR PRIMERO URL DEL REPOSITORIO): git push -u origin master
	
	REVERSAR CAMBIOS EN EL GIT: git checkout -- .

#### GUIA PARA CAMBIAR DE REPOSITORIO EN GIT
	FrontEndAngularRestCRUD>git remote -v
	origin  https://github.com/lmarcela/BackEndSpringRestCRUD.git (fetch)
	origin  https://github.com/lmarcela/BackEndSpringRestCRUD.git (push)
	
	FrontEndAngularRestCRUD>git remote rm origin
	
	FrontEndAngularRestCRUD>git remote -v
	
	FrontEndAngularRestCRUD>git remote add origin https://github.com/lmarcela/FrontEndAngularRestCRUD.git
	
	FrontEndAngularRestCRUD>git remote -v
	origin  https://github.com/lmarcela/FrontEndAngularRestCRUD.git (fetch)
	origin  https://github.com/lmarcela/FrontEndAngularRestCRUD.git (push)
	
### COMANDOS ANGULAR
	
	INICIAR SERVIDOR (EN LA CARPETA DEL PROYECTO): ng serve -o
	CREAR COMPONENTE SIN ARCHIVOS CSS Y SPEC: ng g c components/listuser --spec false -is
	CREAR CLASE: ng g class model/user
	CREAR SERVICIO SIN SPEC: ng g s services/user --spec false 
	PONER EN PRODUCCION: ng build --env=prod --prod
	HTTP-SERVER (SOLO LA PRIMERA VEZ): https://www.npmjs.com/package/http-server (npm install http-server -g)
	EN LA CARPETA DIST DEL PROYECTO: http-server -o 
	
	
	CREAR PROYECTO ANGULAR (RESTCLIENT): ng new FrontEndAngularRestCRUD
	ABRIR PROYECTO EN VSCODE DESDE CONSOLA (Dentro de la carpeta del proyecto Angular): code . 
	INSTALAR BOOTSTRAP CON NODEJS(Dentro de la carpeta del proyecto Angular): npm install bootstrap@next --save


