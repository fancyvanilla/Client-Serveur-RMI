# Bienvenue dans l'Exemple de Chiffrement avec Java RMI! 🚀

Cet exemple concis de Java RMI (Invocation de Méthode à Distance) a pour objectif de fournir une démonstration élaborée du chiffrement avec l'algorithme AES.

## Objectif du Projet 💡

L'objectif ici est de vous montrer comment créer une architecture client-serveur avec Java RMI. On a même un super service de chiffrement côté serveur que vous pouvez appeler depuis votre client en toute simplicité!

## Structure du Projet 🏗️

- Notre projet est organisé de cette manière :

    - **RemoteService**: Le module RemoteService constitue le socle du chiffrement, intégrant l'interface `MyRemoteInterface` ainsi que son implémentation côté serveur, `MyRemoteServer`.

    - **Client.java**: Dans ce composant, le client sollicite l'interface distante pour chiffrer des données. Une approche simple et efficace.

    - **Server.java**: Le serveur est prêt à dévoiler à distance ses capacités de chiffrement.

Allez, lancez-vous et essayez-le par vous-même! 🌟

