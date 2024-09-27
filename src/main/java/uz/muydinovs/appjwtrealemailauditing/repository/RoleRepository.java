package uz.muydinovs.appjwtrealemailauditing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjwtrealemailauditing.entity.Role;
import uz.muydinovs.appjwtrealemailauditing.entity.enums.RoleName;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRoleName(RoleName roleName);
}
