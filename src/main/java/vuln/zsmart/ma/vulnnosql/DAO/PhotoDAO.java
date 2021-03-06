package vuln.zsmart.ma.vulnnosql.DAO;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vuln.zsmart.ma.vulnnosql.Beans.Photo;

import java.util.Optional;

@Repository
public interface PhotoDAO extends MongoRepository<Photo, ObjectId> {

    public void deleteById(ObjectId id);
    public Optional<Photo> findById(ObjectId id);

}
