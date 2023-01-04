# Apropos du tp :
# ServeurTcp
Le but est ici de réaliser un serveur TCP qui accepte en permanence des connections, et pour chacune, envoie
au client le message « Bienvenue sur mon serveur et au revoir » avant de rompre immédiatement la
communication
la classe ServeurTcp.java contient l'implémentation de notre ServeurTcp.
# Serveur de Dialogue:
L'objectif est ici de faire évoluer le serveur de sorte qu'il accepte simultanément plusieurs connexions. L'idée est
de permettre à chaque client qui se connecte d'avoir la possibilité d'envoyer des messages qui seront alors
reçus de tous les clients actuellement connectés.
Pour cela, une solution simple consiste à créer, dans le serveur, un nouveau Thread pour chaque nouvelle
connexion d'un client. Chaque Thread attend des messages sur la Socket dont il a la charge. Lorsqu'un
message est reçu, le thread la répète sur l'ensemble de tous les sockets des connections en cours (qu'il faut donc
également conserver et partager entre les threads)
 # lancement du server
 - la commande  `make` lance notre server qui ecoute sur le port 2022
 - avec le client `nc 127.0.0.1 2022` en peut tester notre serveur en peut envoyer des message à d'autre clients en peut aussi  apercevoire les difrents messages pour des clients dans le serveur.
