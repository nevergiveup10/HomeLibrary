package sample;

public class RelationshipManager implements IManager <Relationship> {
    Relationship relationship = new Relationship();
    Relationship relationshipArr[] = new Relationship[5];
    User user = new User();
    RelationshipDegree relationshipDegree[] = new RelationshipDegree[5];
    RelationshipStatus relationshipStatus[] = new RelationshipStatus[5];


    public void deleteAllUserRelationships (User user){}
    public RelationshipDegree[] getAllDegrees(){return relationshipDegree;}
    public RelationshipStatus[] getAllStatuses(){return relationshipStatus;}
    public Relationship[] getAllUserRelationShips(User user){return relationshipArr;}

    @Override
    public void create(Relationship relationship) {

    }

    @Override
    public <String> void delete(String str) {

    }

    @Override
    public <String, Relationship> Relationship get(String str) {
        return (Relationship) relationship;
    }

    @Override
    public void update(Relationship relationship) {

    }


}
