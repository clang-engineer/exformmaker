import React from 'react';
import { Translate } from 'react-jhipster';

import MenuItem from 'app/shared/layout/menus/menu-item';

const EntitiesMenu = () => {
  return (
    <>
      {/* prettier-ignore */}
      <MenuItem icon="asterisk" to="/point">
        <Translate contentKey="global.menu.entities.point"/>
      </MenuItem>
      <MenuItem icon="asterisk" to="/user-point">
        <Translate contentKey="global.menu.entities.userPoint" />
      </MenuItem>
      <MenuItem icon="asterisk" to="/group">
        <Translate contentKey="global.menu.entities.group" />
      </MenuItem>
      <MenuItem icon="asterisk" to="/user-group">
        <Translate contentKey="global.menu.entities.userGroup" />
      </MenuItem>
      <MenuItem icon="asterisk" to="/company">
        <Translate contentKey="global.menu.entities.company" />
      </MenuItem>
      <MenuItem icon="asterisk" to="/user-company">
        <Translate contentKey="global.menu.entities.userCompany" />
      </MenuItem>
      <MenuItem icon="asterisk" to="/category">
        <Translate contentKey="global.menu.entities.category" />
      </MenuItem>

      {/* jhipster-needle-add-entity-to-menu - JHipster will add entities to the menu here */}
    </>
  );
};

export default EntitiesMenu;
