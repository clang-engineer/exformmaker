import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Point from './point';
import UserPoint from './user-point';
import Group from './group';
import GroupUser from './group-user';
import Company from './company';
import UserCompany from './group-company';
import Category from './category';
import Form from './form';
import CompanyForm from './company-form';
/* jhipster-needle-add-route-import - JHipster will add routes here */

export default () => {
  return (
    <div>
      <ErrorBoundaryRoutes>
        {/* prettier-ignore */}
        <Route path="point/*" element={<Point/>}/>
        <Route path="user-point/*" element={<UserPoint />} />
        <Route path="group/*" element={<Group />} />
        <Route path="group-user/*" element={<GroupUser />} />
        <Route path="company/*" element={<Company />} />
        <Route path="group-company/*" element={<UserCompany />} />
        <Route path="category/*" element={<Category />} />
        <Route path="form/*" element={<Form />} />
        <Route path="company-form/*" element={<CompanyForm />} />
        {/* jhipster-needle-add-route-path - JHipster will add routes here */}
      </ErrorBoundaryRoutes>
    </div>
  );
};
