# Utilisation de l’IA — TP 1

J’ai utilisé Codex pour clarifier certaines consignes et obtenir de l’aide
sur les points ci-dessous. J’ai effectué moi-même les manipulations dans
IntelliJ, les tests et les opérations Git.

L’IA m’a également proposé une formulation des apprentissages présentés
dans ce fichier, que j’ai relue et vérifiée.

## 1. Clarification de l’énoncé

- **Problème rencontré :** je ne comprenais pas toujours l’ordre des
  consignes ni l’emplacement des ajouts demandés.
- **Raison de l’utilisation de l’IA :** obtenir une reformulation des
  étapes pour mieux suivre l’énoncé.
- **Prompts utilisés :** « assure toi de ne pas zapper une etape […]
  les infos sont pas claires », « où exactement » et « ensuite ? ».
- **Réponse de l’IA — extrait :** « Insère le bouton entre le textarea
  et le premier </h:panelGrid>. »
  L’aide comprenait aussi des fragments de code pour les propriétés
  du mode debug et des indications pour intégrer les classes fournies.
- **Ce que j’ai appris :** j’ai compris que les expressions comme
  #{bb.debug} dans la page JSF correspondent à des propriétés de la
  classe Bb, accessibles par leurs getters et setters.

## 2. Compréhension du JSON et de l’historique

- **Problème rencontré :** je voulais vérifier que je copiais le JSON
  de la deuxième requête et comprendre la transmission de l’historique.
- **Raison de l’utilisation de l’IA :** vérifier mon interprétation
  du JSON affiché en mode debug.
- **Prompt utilisé :** j’ai transmis les JSON copiés depuis l’application
  dans la discussion pour les faire vérifier.
- **Réponse de l’IA — extrait :** « JsonAdapterPourGemini conserve cet
  historique dans requeteJson, puis y ajoute les nouvelles questions
  et réponses. »
  L’IA a également expliqué system_instruction, contents, parts, text
  et les rôles user et model.
- **Ce que j’ai appris :** j’ai compris que notre application renvoie
  les échanges précédents à chaque requête pour permettre au modèle
  de suivre la conversation. Cet historique est conservé dans
  requeteJson par JsonAdapterPourGemini.

## 3. Restauration avec Git

- **Problème rencontré :** je ne savais pas comment restaurer le fichier
  modifié après les tests d’erreur demandés.
- **Raison de l’utilisation de l’IA :** comprendre comment retrouver
  la version fonctionnelle sauvegardée.
- **Prompt utilisé :** j’ai transmis les résultats de git status
  et de git diff --stat.
- **Réponse de l’IA — extrait :**

  git restore --source=HEAD -- src/main/java/ma/emsi/ramziahmedrayane/tp1_ramziahmedrayane_19/llm/JsonAdapterPourGemini.java

  « Cette commande ne supprime aucun commit. »

- **Ce que j’ai appris :** j’ai compris que git restore --source=HEAD
  remet le fichier indiqué dans son état du dernier commit.
  Les modifications non enregistrées dans un commit sont annulées
  pour ce fichier, sans supprimer de commit.

## 4. Propositions d’idées pour le rôle système

- **Problème rencontré :** je manquais d’idées pour le rôle du bonus.
- **Raison de l’utilisation de l’IA :** explorer plusieurs possibilités
  avant de choisir.
- **Prompts utilisés :** « je peux pas y penser actuellement,
  propose moi des idées ! ».
- **Réponse de l’IA — extrait :** « Le contradicteur bienveillant :
  il examine une idée, relève un point faible et pose une question
  pour aider à l’améliorer. »
  J’ai choisi ce rôle et soumis une consigne détaillée. L’IA a proposé
  une clarification de cette consigne et le bloc Java pour l’ajouter.
  Elle a aussi fourni les deux messages utilisateur de la conversation
  de test sur une application de révision avec QCM et classement.
- **Ce que j’ai appris :** j’ai compris que les instructions système
  permettent de guider le ton et la structure des réponses.
  J’ai aussi constaté que le modèle peut respecter les trois parties
  demandées tout en suggérant des pistes malgré la consigne de ne pas
  donner de solution.