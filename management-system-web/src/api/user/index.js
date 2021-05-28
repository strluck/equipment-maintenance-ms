import axios from 'axios'

//创建用户信息
const postUser = form => axios.post('/api/v1/user', form).then(res => res.data);

//读取用户信息
const getUser = id => axios.get(`/api/v1/user/${id}`).then(res => res.data);

//修改用户信息
const putUser = (id, form) => axios.put(`/api/v1/user/${id}`, form).then(res => res.data);

export {
    postUser,
    getUser,
    putUser,
}