package de.atruvia.simplewebapp.service;



import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
//@Service
public class BlacklistServiceImpl implements BlacklistService{

    private final List<String> schlecht;



    @Override
    public boolean isBlacklisted(Person possibleBlacklistedPerson) {
        return schlecht.contains(possibleBlacklistedPerson.getVorname());
    }
}
