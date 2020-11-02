# HashiCorpVaultCredentialResolver

This project implement a custom ServiceNow Credential Resolver able to resolve credential identifiers sent from the MID Server into actual credentials from the Hashicorp Vault Credential repository. 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

This project use a community developed Java client for the Vault secrets management solution from HashiCorp. 

### Installing

You can download the binaries directly from the [releases](https://github.com/JefMuller/HashiCorpVaultCredentialResolver/releases) section.

### From Source:

* HashiCorpVaultCredentialResolver requires JDK 1.8 or newer and Custom Vault Java Driver (attached to the release tag).
* Add Mid.jar to Java Build Path
* As well as vault-java-driver-5.3.0.jar
* Import the project in Eclipse (as a maven project) OR just run mvn package to build the jar
* your yar will be in the target folder

## Running the tests

* Use a ServiceNow Instance with “External Credential Storage” plugin (com.snc.discovery.external_credentials) 
* Import above exported JAR file and vault-java-driver-5.3.0.jar to your ServiceNow instance. (MID Server - JAR Files)
* Create Credential in your instance with "External credential store" flag activated.
* Ensure that the "Credential ID" match a secret path in your Hashicorp credential store (ex: secret/mysecret)
* Ensure that the secret in the Vault do contain key/pair matching the ServiceNow Credential record fields (ex: user_name, password)

## Built With

* [Vault Java Driver](https://github.com/BetterCloud/vault-java-driver) - A zero-dependency Java client for the Hashicorp Vault (Beware Custom version)

## Authors

* **Jean-François (Jef) Muller** - *Initial work* - [JefMuller](https://www.linkedin.com/in/jef-muller/)
