package de.atruvia.simplewebapp.service;

public interface BlacklistService {

    boolean isBlacklisted(Person possibleBlacklistedPerson);
}
